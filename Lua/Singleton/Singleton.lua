Single = {}
Single.__index = Single


function Single:Instance()
  if not Single.instanced then
    local obj = setmetatable({}, self)
    obj.instanced = true
    obj.color = nil
    Single = obj
  end
  
  return Single
end

function Single:setColor(color)
  self.color = color
end

function Single:getColor()
  return color
end

inst = Single:Instance()
print(inst.color)
inst2 = Single:Instance()
inst:setColor("blue")
print(inst2.color)
