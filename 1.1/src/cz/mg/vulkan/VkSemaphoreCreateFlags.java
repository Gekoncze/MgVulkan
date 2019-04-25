package cz.mg.vulkan;

public class VkSemaphoreCreateFlags extends VkFlags {
    public VkSemaphoreCreateFlags() {
    }

    protected VkSemaphoreCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSemaphoreCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSemaphoreCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkSemaphoreCreateFlags(int value) {
        setValue(value);
    }
}
