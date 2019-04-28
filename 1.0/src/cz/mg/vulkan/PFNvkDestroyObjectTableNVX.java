package cz.mg.vulkan;

public class PFNvkDestroyObjectTableNVX extends VkFunctionPointer {
    public PFNvkDestroyObjectTableNVX() {
    }

    protected PFNvkDestroyObjectTableNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyObjectTableNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyObjectTableNVX(long value) {
        setValue(value);
    }

    public PFNvkDestroyObjectTableNVX(VkInstance instance) {
        super(instance, new VkString("vkDestroyObjectTableNVX"));
    }

    public void call(VkDevice device, VkObjectTableNVX objectTable, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), objectTable != null ? objectTable.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long objectTable, long pAllocator);



}
