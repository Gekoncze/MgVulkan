package cz.mg.vulkan;

public class PFNvkDestroyDevice extends VkFunctionPointer {
    public PFNvkDestroyDevice() {
    }

    protected PFNvkDestroyDevice(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyDevice(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyDevice(long value) {
        setValue(value);
    }

    public PFNvkDestroyDevice(VkInstance instance) {
        super(instance, new VkString("vkDestroyDevice"));
    }

    public void call(VkDevice device, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long pAllocator);



}
