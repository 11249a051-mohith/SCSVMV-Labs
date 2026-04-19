
# Ex No: 10 — Installation of Linux Guest OS using VMware

## Aim
To install a Linux operating system as a guest OS using VMware virtualization software
and to understand the concept of virtualization.

## System Requirements

| Component | Requirement |
|-----------|-------------|
| Processor | Intel / AMD with virtualization support |
| RAM | Minimum 4 GB |
| Disk Space | Minimum 20 GB free |
| Host OS | Windows / Linux |
| Software | VMware Workstation |
| Guest ISO | Ubuntu Linux ISO |

---

## Procedure

1. Install **VMware Workstation** on the host system.
2. Download the **Ubuntu Linux ISO** file from the official Ubuntu website.
3. Launch VMware Workstation → click **Create a New Virtual Machine**.
4. Select **Typical (Recommended)** → click **Next**.
5. Choose **Installer disc image file (ISO)** → browse and select the Ubuntu ISO.
6. Set Guest OS as **Linux** and version as **Ubuntu 64-bit**.
7. Enter a name for the virtual machine and choose a storage location.
8. Allocate **RAM** (recommended: 2 GB) and set the number of processors.
9. Set disk size (recommended: 20 GB) → choose **Split virtual disk into multiple files**.
10. Click **Finish** to create the virtual machine.
11. **Power On** the virtual machine → Ubuntu installer starts automatically.
12. Follow the on-screen steps:
    - Select language and keyboard layout.
    - Choose **Normal Installation**.
    - Select **Erase disk and install Ubuntu** (inside VM — safe).
    - Set timezone, username, and password.
13. After installation completes, **restart** the virtual machine.
14. Log in with your credentials — the Ubuntu desktop loads successfully.

---

## Sample Output
```
Ubuntu Linux desktop successfully loaded inside VMware virtual machine.
```

---

## Result
A Linux guest operating system was successfully installed using VMware
virtualization software.
