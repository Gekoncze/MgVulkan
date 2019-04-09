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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, fenceCount != null ? fenceCount.getVkAddress() : VkPointer.NULL_ADDRESS, pFences != null ? pFences.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long fenceCount, long pFences, long rval);
}
