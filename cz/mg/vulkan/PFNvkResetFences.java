package cz.mg.vulkan;

public class PFNvkResetFences extends VkFunctionPointer {
    public PFNvkResetFences() {
    }

    public PFNvkResetFences(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkResetFences(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkResetFences(long value) {
        setValue(value);
    }

    public PFNvkResetFences(VkInstance instance) {
        super(instance, new VkString("vkResetFences"));
    }

    public void call(VkDevice device, VkUInt32 fenceCount, VkFence pFences, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), fenceCount != null ? fenceCount.getVkAddress() : VkPointer.getNullAddress(), pFences != null ? pFences.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long fenceCount, long pFences, long rval);
}
