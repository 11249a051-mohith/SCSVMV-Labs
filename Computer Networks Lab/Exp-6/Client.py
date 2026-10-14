import socket
import os
def file_transfer_client():
    client_socket = None
    try:
        # 1. Get filename
        filename = input("Enter the filename to send: ").strip()
        # 2. Check whether the file exists
        if not os.path.isfile(filename):
            print(f"Error: File '{filename}' not found.")
            return
        # 3. Create TCP socket
        client_socket = socket.socket(
            socket.AF_INET, socket.SOCK_STREAM
        )
        # 4. Connect to server
        client_socket.connect(("127.0.0.1", 12345))
        # 5. Send filename followed by newline
        client_socket.sendall(
            os.path.basename(filename).encode("utf-8") + b"\n"
        )
        # 6. Send file data in chunks
        with open(filename, "rb") as file:
            while True:
                chunk = file.read(1024)
                if not chunk:
                    break
                client_socket.sendall(chunk)
        # 7. Signal end of file data
        client_socket.shutdown(socket.SHUT_WR)
        print(f"File '{filename}' sent successfully.")
    except OSError as e:
        print("Error:", e)
    finally:
        if client_socket is not None:
            client_socket.close()
if __name__ == "__main__":
    file_transfer_client()
