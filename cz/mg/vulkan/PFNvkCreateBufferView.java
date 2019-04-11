package cz.mg.vulkan;

public class PFNvkCreateBufferView extends VkFunctionPointer {
    public PFNvkCreateBufferView() {
    }

    public PFNvkCreateBufferView(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateBufferView(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateBufferView(long value) {
        setValue(value);
    }

    public PFNvkCreateBufferView(VkInstance instance) {
        super(instance, new VkString("vkCreateBufferView"));
    }

    public void call(VkDevice device, VkBufferViewCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkBufferView pView, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pView != null ? pView.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pView, long rval);
}
