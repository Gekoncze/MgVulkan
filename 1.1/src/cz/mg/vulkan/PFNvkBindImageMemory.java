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

    public void call(VkDevice device, VkImage image, VkDeviceMemory memory, VkDeviceSize memoryOffset, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative(), memoryOffset != null ? memoryOffset.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long image, long memory, long memoryOffset, long rval);
}
