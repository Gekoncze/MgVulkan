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

    public void call(VkDevice device, VkDeviceMemory memory, VkDeviceSize offset, VkDeviceSize size, VkMemoryMapFlags flags, VkObject ppData, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative(), size != null ? size.getVkAddress() : VkPointer.getNullAddressNative(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative(), ppData != null ? ppData.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long memory, long offset, long size, long flags, long ppData, long rval);


    public int call(VkDevice device, VkDeviceMemory memory, long offset, long size, int flags, VkObject ppData){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative(), offset, size, flags, ppData != null ? ppData.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long memory, long offset, long size, int flags, long ppData);

}
