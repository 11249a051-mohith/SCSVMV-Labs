import socket

def download_web_page(hostname, port, path):
    try:
        client_socket = socket.socket(
            socket.AF_INET, socket.SOCK_STREAM
        )
        client_socket.connect((hostname, port))

        request = (
            f"GET {path} HTTP/1.1\r\n"
            f"Host: {hostname}\r\n"
            "Connection: close\r\n\r\n"
        )

        client_socket.sendall(request.encode())

        response = b""
        while True:
            data = client_socket.recv(4096)
            if not data:
                break
            response += data

        client_socket.close()
        return response.decode(errors="ignore")

    except Exception as e:
        return f"Error occurred: {e}"
