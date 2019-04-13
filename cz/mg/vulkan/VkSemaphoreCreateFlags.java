package cz.mg.vulkan;

public class VkSemaphoreCreateFlags extends VkFlags {
    public VkSemaphoreCreateFlags() {
    }

    public VkSemaphoreCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSemaphoreCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSemaphoreCreateFlags(int value) {
        setValue(value);
    }
}
