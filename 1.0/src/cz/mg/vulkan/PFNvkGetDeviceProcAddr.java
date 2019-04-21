package cz.mg.vulkan;

public class PFNvkGetDeviceProcAddr extends VkFunctionPointer {
    public PFNvkGetDeviceProcAddr() {
    }

    public PFNvkGetDeviceProcAddr(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDeviceProcAddr(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceProcAddr(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceProcAddr(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceProcAddr"));
    }

    public void call(VkDevice device, VkChar pName, PFNvkVoidFunction rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pName != null ? pName.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long pName, long rval);
}
