package cz.mg.vulkan;

public class PFNvkMapMemory extends VkFunctionPointer {
    public PFNvkMapMemory() {
    }

    protected PFNvkMapMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkMapMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkMapMemory(long value) {
        setValue(value);
    }

    public PFNvkMapMemory(VkInstance instance) {
        super(instance, new VkString("vkMapMemory"));
    }

    public int call(VkDevice device, VkDeviceMemory memory, long offset, long size, int flags, VkObject ppData){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative(), offset, size, flags, ppData != null ? ppData.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long memory, long offset, long size, int flags, long ppData);

}
