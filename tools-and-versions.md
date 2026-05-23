# Tools and Versions

This document records the default toolchain. Exact versions may change over time, but every track should tell learners how to verify their environment.

## Core tools

- Terminal appropriate to the operating system
- Code editor with syntax highlighting and integrated terminal
- Git
- Java JDK for Tracks 1-3
- Build tool for Java projects, introduced concept-before-tool
- Node.js and npm for frontend tracks
- Browser developer tools
- Database tooling for Track 3

## Version principle

Prefer current long-term-support versions unless a track has a reason to pin a specific version. Every setup module should include a command or visual check that proves the tool is installed and usable.

## Track 0 installation principle

Track 0 should not ask learners to install tools blindly. Every tool installation should include:

- what the tool is for
- how to check whether it is already installed
- how to install it on macOS, Windows, and Linux where reasonable
- how to verify the installation afterward
- where to look first if verification fails

## Package manager defaults

These are defaults, not permanent requirements:

- **macOS:** Homebrew is the default system package manager. SDKMAN is preferred for Java when learners need to switch JDK versions later.
- **Windows:** winget is the default first choice for Git, VS Code, Java, and Node.js. Learners who use WSL should follow Linux instructions inside WSL.
- **Linux:** use the distribution package manager for system tools, SDKMAN for Java, and nvm for Node.js when version switching matters.

## Editor defaults

VS Code is the default Track 0 editor because it is lightweight, cross-platform, widely documented, and works well for terminal practice and frontend work.

IntelliJ IDEA Community is recommended later for heavier Java work because it gives stronger Java navigation, refactoring, and test tooling.

The principle is simple: start with one editor, learn it well enough to open folders, edit files, use the integrated terminal, install extensions, and read errors. Add a second IDE only when the use case justifies it.
