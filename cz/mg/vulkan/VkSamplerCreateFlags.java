package cz.mg.vulkan;

public class VkSamplerCreateFlags extends VkFlags {
    public VkSamplerCreateFlags() {
    }

    public VkSamplerCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSamplerCreateFlags(int value) {
        setValue(value);
    }
}
