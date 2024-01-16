<?php
//'Logger' use the singleton design pattern to ensure only one instance of the class can be created.

class Logger {
    private static $instance;
    private $logs;

    private function __construct() {
        $this->logs = [];
    }

    public static function getInstance() {
        if (self::$instance === null) {
            self::$instance = new Logger();
        }

        return self::$instance;
    }

    public function log($message) {
        $this->logs[] = $message;
    }

    public function getLogs() {
        return $this->logs;
    }
}

$logger = Logger::getInstance();
$logger->log("Log 1</br>");
$logger->log("Log 2</br>");

$logs = $logger->getLogs();

// Output Logs
foreach ($logs as $log) {
    echo $log . "\n";
}

?>
