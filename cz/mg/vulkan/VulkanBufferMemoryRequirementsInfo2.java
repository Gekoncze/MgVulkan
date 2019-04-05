package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanBufferMemoryRequirementsInfo2 extends VulkanObject {
    public VulkanBufferMemoryRequirementsInfo2(){
        super(new VkBufferMemoryRequirementsInfo2());
    }

    public VulkanBufferMemoryRequirementsInfo2(VkBufferMemoryRequirementsInfo2 vk){
        super(vk);
    }

    @Override
    public VkBufferMemoryRequirementsInfo2 getVk(){
        return (VkBufferMemoryRequirementsInfo2) super.getVk();
    }
    public VulkanBufferMemoryRequirementsInfo2(VulkanObject pNext, VulkanBuffer buffer) {
        super(new VkBufferMemoryRequirementsInfo2(pNext.getVk(), buffer.getVk()));
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

    public VulkanBuffer getBuffer() {
        return new VulkanBuffer(getVk().getBuffer());
    }

    public void setBuffer(VulkanBuffer buffer) {
        getVk().setBuffer(buffer.getVk());
    }


    public static class Array extends VulkanBufferMemoryRequirementsInfo2 implements cz.mg.collections.array.ReadonlyArray<VulkanBufferMemoryRequirementsInfo2> {
        public Array(VkBufferMemoryRequirementsInfo2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBufferMemoryRequirementsInfo2.Array(count));
        }

        public Array(int count, VulkanBufferMemoryRequirementsInfo2 o){
            this(new VkBufferMemoryRequirementsInfo2.Array(count, o.getVk()));
        }

        @Override
        public VkBufferMemoryRequirementsInfo2.Array getVk(){
            return (VkBufferMemoryRequirementsInfo2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBufferMemoryRequirementsInfo2 get(int i){
            return new VulkanBufferMemoryRequirementsInfo2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBufferMemoryRequirementsInfo2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBufferMemoryRequirementsInfo2.Pointer());
        }

        public Pointer(long value) {
            this(new VkBufferMemoryRequirementsInfo2.Pointer(value));
        }

        @Override
        public VkBufferMemoryRequirementsInfo2.Pointer getVk(){
            return (VkBufferMemoryRequirementsInfo2.Pointer) super.getVk();
        }

        public static class Array extends VulkanBufferMemoryRequirementsInfo2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBufferMemoryRequirementsInfo2.Pointer> {
            public Array(int count) {
                super(new VkBufferMemoryRequirementsInfo2.Pointer.Array(count));
            }

            public Array(VulkanBufferMemoryRequirementsInfo2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBufferMemoryRequirementsInfo2.Pointer.Array getVk(){
                return (VkBufferMemoryRequirementsInfo2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBufferMemoryRequirementsInfo2.Pointer get(int i){
                return new VulkanBufferMemoryRequirementsInfo2.Pointer(getVk().get(i));
            }
        }
    }
}
