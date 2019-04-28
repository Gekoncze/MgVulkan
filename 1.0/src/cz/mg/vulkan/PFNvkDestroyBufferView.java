package cz.mg.vulkan;

public class PFNvkDestroyBufferView extends VkFunctionPointer {
    public PFNvkDestroyBufferView() {
    }

    protected PFNvkDestroyBufferView(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyBufferView(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyBufferView(long value) {
        setValue(value);
    }

    public PFNvkDestroyBufferView(VkInstance instance) {
        super(instance, new VkString("vkDestroyBufferView"));
    }

    public void call(VkDevice device, VkBufferView bufferView, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), bufferView != null ? bufferView.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long bufferView, long pAllocator);



}
