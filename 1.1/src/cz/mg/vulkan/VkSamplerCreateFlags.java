package cz.mg.vulkan;

public class VkSamplerCreateFlags extends VkFlags {
    public VkSamplerCreateFlags() {
    }

    protected VkSamplerCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSamplerCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSamplerCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkSamplerCreateFlags(int value) {
        setValue(value);
    }
}
