package cz.mg.vulkan;

public class VkShaderStageFlags extends VkFlags {
    public VkShaderStageFlags() {
    }

    protected VkShaderStageFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkShaderStageFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkShaderStageFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkShaderStageFlags(int value) {
        setValue(value);
    }
}
