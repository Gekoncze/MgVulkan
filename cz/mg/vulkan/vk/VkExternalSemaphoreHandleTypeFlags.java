package cz.mg.vulkan.vk;

public class VkExternalSemaphoreHandleTypeFlags extends VkFlags {
    public VkExternalSemaphoreHandleTypeFlags() {
    }

    public VkExternalSemaphoreHandleTypeFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalSemaphoreHandleTypeFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExternalSemaphoreHandleTypeFlags(int value) {
        setValue(value);
    }
}
