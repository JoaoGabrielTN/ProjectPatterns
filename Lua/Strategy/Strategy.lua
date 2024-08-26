function funcNew(obj)
    function obj:new(o)
      o = o or {}
      setmetatable(o, self)
      self.__index = self
      return o
    end
    
    return obj
  end
  
  BaseAttack = {}
  function BaseAttack:Create()
    return funcNew(BaseAttack):new()
  end
  
  function BaseAttack:Hit()
    return 'Punch'
  end
  
  SwordAttack = BaseAttack:Create()
  function SwordAttack:Create()
    return funcNew(SwordAttack):new()
  end
  
  function SwordAttack:Hit()
    return 'Sword'
  end
  
  AxeAttack = BaseAttack:Create()
  function AxeAttack:Create()
    return funcNew(AxeAttack):new()
  end
  
  function AxeAttack:Hit()
    print('Axe')
  end
  
  Character = {}
  function Character:Create(t, a)
    return funcNew(Character):new({
      type_char = t,
      attack = a or BaseAttack:Create()
    })
  end
  
  function Character:Attack()
    print(self.type_char)
    print(self.attack:Hit())
  end
  
  sword = SwordAttack:Create()
  hero = Character:Create('jogador', sword)
  hero:Attack()
  
  axe = AxeAttack:Create()
  enemy = Character:Create('Enemy', axe)
  enemy:Attack()