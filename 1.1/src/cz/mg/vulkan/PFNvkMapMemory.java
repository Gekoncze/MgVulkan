package cz.mg.vulkan;

public class PFNvkMapMemory extends VkFunctionPointer {
    public PFNvkMapMemory() {
    }

    public PFNvkMapMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkMapMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkMapMemory(long value) {
        setValue(value);
    }

    public PFNvkMapMemory(VkInstance instance) {
        super(instance, new VkString("vkMapMemory"));
    }

    public void call(VkDevice device, VkDeviceMemory memory, VkDeviceSize offset, VkDeviceSize size, VkMemoryMapFlags flags, VkObject ppData, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative(), size != null ? size.getVkAddress() : VkPointer.getNullAddressNative(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative(), ppData != null ? ppData.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long memory, long offset, long size, long flags, long ppData, long rval);
}
