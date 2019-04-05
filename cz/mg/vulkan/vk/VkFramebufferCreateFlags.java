package cz.mg.vulkan.vk;

public class VkFramebufferCreateFlags extends VkFlags {
    public VkFramebufferCreateFlags() {
    }

    public VkFramebufferCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFramebufferCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkFramebufferCreateFlags(int value) {
        setValue(value);
    }
}
