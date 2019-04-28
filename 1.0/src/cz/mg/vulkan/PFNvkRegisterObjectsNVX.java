package cz.mg.vulkan;

public class PFNvkRegisterObjectsNVX extends VkFunctionPointer {
    public PFNvkRegisterObjectsNVX() {
    }

    protected PFNvkRegisterObjectsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkRegisterObjectsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkRegisterObjectsNVX(long value) {
        setValue(value);
    }

    public PFNvkRegisterObjectsNVX(VkInstance instance) {
        super(instance, new VkString("vkRegisterObjectsNVX"));
    }

    public int call(VkDevice device, VkObjectTableNVX objectTable, int objectCount, VkObject ppObjectTableEntries, VkUInt32 pObjectIndices){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), objectTable != null ? objectTable.getVkAddress() : VkPointer.getNullAddressNative(), objectCount, ppObjectTableEntries != null ? ppObjectTableEntries.getVkAddress() : VkPointer.NULL, pObjectIndices != null ? pObjectIndices.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long objectTable, int objectCount, long ppObjectTableEntries, long pObjectIndices);

}
