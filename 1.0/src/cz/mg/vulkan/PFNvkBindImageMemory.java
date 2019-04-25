package cz.mg.vulkan;

public class PFNvkBindImageMemory extends VkFunctionPointer {
    public PFNvkBindImageMemory() {
    }

    public PFNvkBindImageMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkBindImageMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkBindImageMemory(long value) {
        setValue(value);
    }

    public PFNvkBindImageMemory(VkInstance instance) {
        super(instance, new VkString("vkBindImageMemory"));
    }

    public void call(VkDevice device, VkImage image, VkDeviceMemory memory, VkDeviceSize memoryOffset, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), image != null ? image.getVkAddress() : VkPointer.getNullAddress(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddress(), memoryOffset != null ? memoryOffset.getVkAddress() : VkPointer.getNullAddress(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    protected static native void call(long vkaddress, long device, long image, long memory, long memoryOffset, long rval);
}
