class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        if (this.minutes == 59) {
            this.minutes = 0;
            this.hours++;
        } else {
            this.minutes++;
        }
        if (this.hours == 13) {
            this.hours = 1;
        }

    }
}