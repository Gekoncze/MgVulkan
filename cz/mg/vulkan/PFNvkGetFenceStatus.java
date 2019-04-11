package cz.mg.vulkan;

public class PFNvkGetFenceStatus extends VkFunctionPointer {
    public PFNvkGetFenceStatus() {
    }

    public PFNvkGetFenceStatus(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetFenceStatus(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetFenceStatus(long value) {
        setValue(value);
    }

    public PFNvkGetFenceStatus(VkInstance instance) {
        super(instance, new VkString("vkGetFenceStatus"));
    }

    public void call(VkDevice device, VkFence fence, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), fence != null ? fence.getVkAddress() : VkPointer.getNullAddress(), rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long fence, long rval);
}
