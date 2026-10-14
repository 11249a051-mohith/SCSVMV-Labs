import socket
import threading
clients = []
clients_lock = threading.Lock()
def handle_client(client_socket, client_address):
    print(f"New connection from {client_address}")
    try:
        while True:
            data = client_socket.recv(1024)
            if not data:
                break
            message = data.decode("utf-8")
            print(f"Received from {client_address}: {message}")
            # Broadcast to all other clients
            with clients_lock:
                other_clients = [
                    client for client in clients
                    if client != client_socket
                ]
            for client in other_clients:
                try:
                    client.sendall(data)
                except OSError:
                    print("Failed to send to a client.")
    except OSError as e:
        print(f"Connection error with {client_address}: {e}")
    finally:
        # Remove disconnected client safely
        with clients_lock:
            if client_socket in clients:
                clients.remove(client_socket)
        client_socket.close()
        print(f"{client_address} disconnected")
def chat_server():
    server_socket = socket.socket(
        socket.AF_INET,
        socket.SOCK_STREAM
    )
    server_socket.setsockopt(
        socket.SOL_SOCKET,
        socket.SO_REUSEADDR,
        1
    )
    try:
        server_socket.bind(("127.0.0.1", 55555))
        server_socket.listen(5)
        print("Server listening on port 55555...")
        while True:
            client_socket, client_address = server_socket.accept()
            with clients_lock:
                clients.append(client_socket)
            thread = threading.Thread(
                target=handle_client,
                args=(client_socket, client_address),
                daemon=True
            )
            thread.start()
    except KeyboardInterrupt:
        print("\nChat server stopped.")
    finally:
        server_socket.close()
if __name__ == "__main__":
    chat_server()
