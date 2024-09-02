function funcNew(obj)
    function obj:new(o)
      o = o or {}
      setmetatable(o, self)
      self.__index = self
      return o
    end
    
    return obj
  end
  
  PhaseBase = {}
  function PhaseBase:Create()
    return funcNew(PhaseBase):new()
  end
  
  function PhaseBase:CurrPhase()
    return 'phase base'
  end
  
  function PhaseBase:TakeAction()
    print('base phase action')
  end
  
  function PhaseBase:EndPhase()
    return nil
  end
  
  PhaseFortification = PhaseBase:Create()
  function PhaseFortification:Create()
    return funcNew(PhaseFortification):new()
  end
  
  function PhaseFortification:CurrPhase()
    return 'phase fortification'
  end
  
  function PhaseFortification:TakeAction()
    print('Fortificou')
  end
  
  function PhaseFortification:EndPhase()
    return funcNew(PhaseAttack):new()
  end
  
  PhaseAttack = PhaseBase:Create()
  function PhaseAttack:Create()
    return funcNew(PhaseAttack):new()
  end
  
  function PhaseAttack:CurrPhase()
    return 'phase attack'
  end
  
  function PhaseAttack:TakeAction()
    print('Atacou')
  end
  
  function PhaseAttack:EndPhase()
    return nil
  end
  
  
  Phase = PhaseFortification:Create()
  print(Phase:CurrPhase())
  Phase:TakeAction()
  Phase = Phase:EndPhase()
  print(Phase:CurrPhase())