package cz.mg.vulkan;

public class PFNvkBindImageMemory extends VkFunctionPointer {
    public PFNvkBindImageMemory() {
    }

    protected PFNvkBindImageMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkBindImageMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkBindImageMemory(long value) {
        setValue(value);
    }

    public PFNvkBindImageMemory(VkInstance instance) {
        super(instance, new VkString("vkBindImageMemory"));
    }

    public int call(VkDevice device, VkImage image, VkDeviceMemory memory, long memoryOffset){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative(), memoryOffset);
    }

    protected static native int callNative(long vkaddress, long device, long image, long memory, long memoryOffset);

}
