package cz.mg.vulkan;

public class PFNvkBindImageMemory2 extends VkFunctionPointer {
    public PFNvkBindImageMemory2() {
    }

    protected PFNvkBindImageMemory2(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkBindImageMemory2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkBindImageMemory2(long value) {
        setValue(value);
    }

    public PFNvkBindImageMemory2(VkInstance instance) {
        super(instance, new VkString("vkBindImageMemory2"));
    }

    public int call(VkDevice device, int bindInfoCount, VkBindImageMemoryInfo pBindInfos){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), bindInfoCount, pBindInfos != null ? pBindInfos.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, int bindInfoCount, long pBindInfos);

}
