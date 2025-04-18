# Football Scoreboard System

This project implements a real-time football match scoreboard system that updates live scores to various platforms, including mobile apps, TV channels, and websites. It utilizes the Observer design pattern to manage dynamic subscriptions and notifications.

## Project Structure

```
football-scoreboard-system
├── src
│   ├── Main.java              # Main entry point of the application
│   ├── FootballScoreboard.java # Subject class that manages observers
│   ├── Observer.java          # Interface for observers
│   ├── MobileApp.java         # Observer implementation for mobile applications
│   ├── TVChannel.java         # Observer implementation for TV channels
│   ├── Website.java           # Observer implementation for websites
│   └── utils
│       └── NotificationUtils.java # Utility methods for notifications
├── README.md                  # Project documentation
└── .gitignore                 # Files to ignore in version control
```

## Features

- Real-time updates for football match scores and status changes.
- Dynamic subscription management for various platforms.
- Support for multiple observer implementations (Mobile App, TV Channel, Website).
- Easy to extend with new platforms without modifying existing logic.

## Setup Instructions

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```
   cd football-scoreboard-system
   ```

3. Compile the Java files:
   ```
   javac src/*.java src/utils/*.java
   ```

4. Run the application:
   ```
   java src/Main
   ```

## Usage

- Platforms can subscribe to the `FootballScoreboard` to receive live updates.
- When a goal is scored or the match status changes, all subscribed platforms will receive notifications.
- Platforms can unsubscribe at any time to stop receiving updates.

## Overview

The Football Scoreboard System is designed to provide a seamless experience for users wanting to follow live football matches. By implementing the Observer pattern, the system ensures that all subscribed platforms receive timely updates without the need for direct coupling between the scoreboard and the platforms. This architecture allows for easy scalability and maintenance.