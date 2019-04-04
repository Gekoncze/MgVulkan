package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSpecializationMapEntry.html">khronos documentation</a>
 **/
public class VulkanSpecializationMapEntry extends VulkanObject {
    public VulkanSpecializationMapEntry(){
        super(new VkSpecializationMapEntry());
    }

    public VulkanSpecializationMapEntry(VkSpecializationMapEntry vk){
        super(vk);
    }

    @Override
    public VkSpecializationMapEntry getVk(){
        return (VkSpecializationMapEntry) super.getVk();
    }

    public VulkanSpecializationMapEntry(VulkanUInt32 constantID, VulkanUInt32 offset, VulkanSize size) {
        super(new VkSpecializationMapEntry(constantID.getVk(), offset.getVk(), size.getVk()));
    }

    public VulkanUInt32 getConstantID() {
        return new VulkanUInt32(getVk().getConstantID());
    }

    public void setConstantID(VulkanUInt32 constantID) {
        getVk().setConstantID(constantID.getVk());
    }

    public VulkanUInt32 getOffset() {
        return new VulkanUInt32(getVk().getOffset());
    }

    public void setOffset(VulkanUInt32 offset) {
        getVk().setOffset(offset.getVk());
    }

    public VulkanSize getSize() {
        return new VulkanSize(getVk().getSize());
    }

    public void setSize(VulkanSize size) {
        getVk().setSize(size.getVk());
    }


    public static class Array extends VulkanSpecializationMapEntry implements cz.mg.collections.array.ReadonlyArray<VulkanSpecializationMapEntry> {
        public Array(VkSpecializationMapEntry.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSpecializationMapEntry.Array(count));
        }

        public Array(int count, VulkanSpecializationMapEntry o){
            this(new VkSpecializationMapEntry.Array(count, o.getVk()));
        }

        @Override
        public VkSpecializationMapEntry.Array getVk(){
            return (VkSpecializationMapEntry.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSpecializationMapEntry get(int i){
            return new VulkanSpecializationMapEntry(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSpecializationMapEntry.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSpecializationMapEntry.Pointer());
        }

        public Pointer(long value) {
            this(new VkSpecializationMapEntry.Pointer(value));
        }

        @Override
        public VkSpecializationMapEntry.Pointer getVk(){
            return (VkSpecializationMapEntry.Pointer) super.getVk();
        }

        public static class Array extends VulkanSpecializationMapEntry.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSpecializationMapEntry.Pointer> {
            public Array(int count) {
                super(new VkSpecializationMapEntry.Pointer.Array(count));
            }

            public Array(VulkanSpecializationMapEntry[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSpecializationMapEntry.Pointer.Array getVk(){
                return (VkSpecializationMapEntry.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSpecializationMapEntry.Pointer get(int i){
                return new VulkanSpecializationMapEntry.Pointer(getVk().get(i));
            }
        }
    }
}
