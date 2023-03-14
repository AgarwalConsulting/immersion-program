#!/usr/bin/env ruby

require 'date'

def random_amount
  "$#{rand(1..1000)}.#{rand(1..99)}"
end

def generate_log
  "#{DateTime.now} - New sale registered for #{random_amount}"
end

log_file = Date.new(2009,11,26).to_time.to_i

# mkdir -p /var/logs/sales

while true
  log_line = generate_log

  File.write("/var/logs/sales/#{log_file}.log", log_line+"\n", mode: 'a')

  sleep 1
end
