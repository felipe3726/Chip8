import spock.lang.Specification
    def "Clear Screen is printed"(){
        setup:
        def app = new Dissasembler()

        when:
        def result = app.cls()

        then:
        result == "0000: CLS"
    }

    def "Return is printed"(){
        setup:
        def app = new Dissasembler()

        when:
        def result = app.ret()

        then: 
        result == "0000: RET"
    }

 def "JMP is decoded"(){
        setup:
        def app = new Dissasembler()
        
        when:
        def result = app.jmp((byte)0x13, (byte)0x54)

        then:

        result == "0000: JMP 0354"
    }


    def "CALL is decoded"(){
        setup:
        def app = new Dissasembler()
        
        when:
        def result = app.call((byte)0x23, (byte)0x54)

        then:

        result == "0000: CALL 0354"
    }

    def "SE is decoded"(){
        setup:
        def app = new Dissasembler()
        
        when:
        def result = app.se((byte)0x3E, (byte)0x54)

        then:

        result == "0000: SE V3, 54"
    }

    def "SNE is decoded"(){
        setup:
        def app = new Dissasembler()

        when:
        def result = app.sne((byte)0x4E, (byte)0x54)

        then:

        result == "0000: SNE VE, 54"
    }

    def "SE is decoded"(){
        setup:
        def app = new Dissasembler()

        when:
        def result = app.se1((byte)0x5E, (byte)0x50)

        then:

        result == "0000: SE VE, V5"
    }