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

    public int call(VkDevice device, VkBuffer buffer, VkDeviceMemory memory, long memoryOffset){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative(), memoryOffset);
    }

    protected static native int callNative(long vkaddress, long device, long buffer, long memory, long memoryOffset);

}
