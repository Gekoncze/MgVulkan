package cz.mg.vulkan;

public class PFNvkWaitForFences extends VkFunctionPointer {
    public PFNvkWaitForFences() {
    }

    protected PFNvkWaitForFences(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkWaitForFences(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkWaitForFences(long value) {
        setValue(value);
    }

    public PFNvkWaitForFences(VkInstance instance) {
        super(instance, new VkString("vkWaitForFences"));
    }

    public int call(VkDevice device, int fenceCount, VkFence pFences, int waitAll, long timeout){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), fenceCount, pFences != null ? pFences.getVkAddress() : VkPointer.NULL, waitAll, timeout);
    }

    protected static native int callNative(long vkaddress, long device, int fenceCount, long pFences, int waitAll, long timeout);

}
