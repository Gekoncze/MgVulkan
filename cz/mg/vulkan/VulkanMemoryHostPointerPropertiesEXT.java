package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryHostPointerPropertiesEXT extends VulkanObject {
    public VulkanMemoryHostPointerPropertiesEXT(){
        super(new VkMemoryHostPointerPropertiesEXT());
    }

    public VulkanMemoryHostPointerPropertiesEXT(VkMemoryHostPointerPropertiesEXT vk){
        super(vk);
    }

    @Override
    public VkMemoryHostPointerPropertiesEXT getVk(){
        return (VkMemoryHostPointerPropertiesEXT) super.getVk();
    }

    public VulkanMemoryHostPointerPropertiesEXT(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 memoryTypeBits) {
        super(new VkMemoryHostPointerPropertiesEXT(sType.getVk(), pNext.getVk(), memoryTypeBits.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanUInt32 getMemoryTypeBits() {
        return new VulkanUInt32(getVk().getMemoryTypeBits());
    }

    public void setMemoryTypeBits(VulkanUInt32 memoryTypeBits) {
        getVk().setMemoryTypeBits(memoryTypeBits.getVk());
    }


    public static class Array extends VulkanMemoryHostPointerPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryHostPointerPropertiesEXT> {
        public Array(VkMemoryHostPointerPropertiesEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryHostPointerPropertiesEXT.Array(count));
        }

        public Array(int count, VulkanMemoryHostPointerPropertiesEXT o){
            this(new VkMemoryHostPointerPropertiesEXT.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryHostPointerPropertiesEXT.Array getVk(){
            return (VkMemoryHostPointerPropertiesEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryHostPointerPropertiesEXT get(int i){
            return new VulkanMemoryHostPointerPropertiesEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryHostPointerPropertiesEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryHostPointerPropertiesEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryHostPointerPropertiesEXT.Pointer(value));
        }

        @Override
        public VkMemoryHostPointerPropertiesEXT.Pointer getVk(){
            return (VkMemoryHostPointerPropertiesEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryHostPointerPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryHostPointerPropertiesEXT.Pointer> {
            public Array(int count) {
                super(new VkMemoryHostPointerPropertiesEXT.Pointer.Array(count));
            }

            public Array(VulkanMemoryHostPointerPropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryHostPointerPropertiesEXT.Pointer.Array getVk(){
                return (VkMemoryHostPointerPropertiesEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryHostPointerPropertiesEXT.Pointer get(int i){
                return new VulkanMemoryHostPointerPropertiesEXT.Pointer(getVk().get(i));
            }
        }
    }
}
