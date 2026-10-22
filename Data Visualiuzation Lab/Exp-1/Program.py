"""Experiment 1: report installed visualization library versions."""
from importlib.metadata import PackageNotFoundError, version

PACKAGES = ("matplotlib", "seaborn", "plotly", "pandas")

for package in PACKAGES:
    try:
        print(f"{package.title()}: {version(package)}")
    except PackageNotFoundError:
        print(f"{package.title()}: not installed")
