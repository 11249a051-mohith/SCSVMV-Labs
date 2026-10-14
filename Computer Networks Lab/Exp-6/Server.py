
import socket
import os

def file_transfer_server():
    server_socket = None
    connection = None

    try:
        # 1. Create TCP socket
        server_socket = socket.socket(
            socket.AF_INET, socket.SOCK_STREAM
        )

        # 2. Prevent address reuse error
        server_socket.setsockopt(
            socket.SOL_SOCKET, socket.SO_REUSEADDR, 1
        )

        # 3. Bind to localhost and port
        server_socket.bind(("127.0.0.1", 12345))

        # 4. Listen for connections
        server_socket.listen(1)
        print("Server listening on port 12345...")

        # 5. Accept connection
        connection, client_address = server_socket.accept()
        print(f"Connected by {client_address}")

        with connection:
            # 6. Receive filename
            filename = connection.recv(1024).decode("utf-8")

            if not filename:
                raise ValueError("No filename received")

            # Keep only the filename, not any directory path
            filename = os.path.basename(filename)

            if filename in ("", ".", ".."):
                raise ValueError("Invalid filename")

            print(f"Receiving file: {filename}")

            # 7. Receive file in binary write mode
            output_filename = f"received_{filename}"

            with open(output_filename, "wb") as file:
                while True:
                    data = connection.recv(1024)

                    if not data:
                        break

                    file.write(data)

            print(f"File saved as {output_filename}")

    except (OSError, ValueError, UnicodeDecodeError) as e:
        print("Error:", e)

    finally:
        if connection is not None:
            connection.close()

        if server_socket is not None:
            server_socket.close()


if __name__ == "__main__":
    file_transfer_server()
