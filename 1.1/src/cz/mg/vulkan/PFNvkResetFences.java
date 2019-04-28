package cz.mg.vulkan;

public class PFNvkResetFences extends VkFunctionPointer {
    public PFNvkResetFences() {
    }

    protected PFNvkResetFences(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkResetFences(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkResetFences(long value) {
        setValue(value);
    }

    public PFNvkResetFences(VkInstance instance) {
        super(instance, new VkString("vkResetFences"));
    }

    public int call(VkDevice device, int fenceCount, VkFence pFences){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), fenceCount, pFences != null ? pFences.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, int fenceCount, long pFences);

}
