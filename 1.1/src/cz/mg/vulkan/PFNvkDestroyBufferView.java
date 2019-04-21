package cz.mg.vulkan;

public class PFNvkDestroyBufferView extends VkFunctionPointer {
    public PFNvkDestroyBufferView() {
    }

    public PFNvkDestroyBufferView(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyBufferView(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyBufferView(long value) {
        setValue(value);
    }

    public PFNvkDestroyBufferView(VkInstance instance) {
        super(instance, new VkString("vkDestroyBufferView"));
    }

    public void call(VkDevice device, VkBufferView bufferView, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), bufferView != null ? bufferView.getVkAddress() : VkPointer.getNullAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long bufferView, long pAllocator);
}
