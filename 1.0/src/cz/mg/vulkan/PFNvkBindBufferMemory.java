package cz.mg.vulkan;

public class PFNvkBindBufferMemory extends VkFunctionPointer {
    public PFNvkBindBufferMemory() {
    }

    protected PFNvkBindBufferMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkBindBufferMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkBindBufferMemory(long value) {
        setValue(value);
    }

    public PFNvkBindBufferMemory(VkInstance instance) {
        super(instance, new VkString("vkBindBufferMemory"));
    }

    public void call(VkDevice device, VkBuffer buffer, VkDeviceMemory memory, VkDeviceSize memoryOffset, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative(), memoryOffset != null ? memoryOffset.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long buffer, long memory, long memoryOffset, long rval);


    public int call(VkDevice device, VkBuffer buffer, VkDeviceMemory memory, long memoryOffset){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative(), memoryOffset);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long buffer, long memory, long memoryOffset);

}
