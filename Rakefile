# Rakefile
task default: [:fix0, :checkModel]

task :fix0 do
    puts "Checking fix #0: Updating README.adoc"
    `ruby tests/testfix0.rb README.adoc`
    puts "=> SUCCESS"
end

task :checkModel do
    puts "Checking the PlantUML model"
    `ruby tests/checkModel.rb docs/TP3.plantuml`
    puts "=> SUCCESS"
end

