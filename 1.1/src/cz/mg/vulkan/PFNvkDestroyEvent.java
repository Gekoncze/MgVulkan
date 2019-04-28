package cz.mg.vulkan;

public class PFNvkDestroyEvent extends VkFunctionPointer {
    public PFNvkDestroyEvent() {
    }

    protected PFNvkDestroyEvent(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyEvent(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyEvent(long value) {
        setValue(value);
    }

    public PFNvkDestroyEvent(VkInstance instance) {
        super(instance, new VkString("vkDestroyEvent"));
    }

    public void call(VkDevice device, VkEvent event, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), event != null ? event.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long event, long pAllocator);



}
