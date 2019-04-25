package cz.mg.vulkan;

public class PFNvkDestroyInstance extends VkFunctionPointer {
    public PFNvkDestroyInstance() {
    }

    protected PFNvkDestroyInstance(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyInstance(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyInstance(long value) {
        setValue(value);
    }

    public PFNvkDestroyInstance(VkInstance instance) {
        super(instance, new VkString("vkDestroyInstance"));
    }

    public void call(VkInstance instance, VkAllocationCallbacks pAllocator){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long instance, long pAllocator);
}
