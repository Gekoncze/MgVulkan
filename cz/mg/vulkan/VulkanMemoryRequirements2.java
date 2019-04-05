package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryRequirements2 extends VulkanObject {
    public VulkanMemoryRequirements2(){
        super(new VkMemoryRequirements2());
    }

    public VulkanMemoryRequirements2(VkMemoryRequirements2 vk){
        super(vk);
    }

    @Override
    public VkMemoryRequirements2 getVk(){
        return (VkMemoryRequirements2) super.getVk();
    }

    public VulkanMemoryRequirements2(VulkanStructureType sType, VulkanObject pNext, VulkanMemoryRequirements memoryRequirements) {
        super(new VkMemoryRequirements2(sType.getVk(), pNext.getVk(), memoryRequirements.getVk()));
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

    public VulkanMemoryRequirements getMemoryRequirements() {
        return new VulkanMemoryRequirements(getVk().getMemoryRequirements());
    }

    public void setMemoryRequirements(VulkanMemoryRequirements memoryRequirements) {
        getVk().setMemoryRequirements(memoryRequirements.getVk());
    }


    public static class Array extends VulkanMemoryRequirements2 implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryRequirements2> {
        public Array(VkMemoryRequirements2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryRequirements2.Array(count));
        }

        public Array(int count, VulkanMemoryRequirements2 o){
            this(new VkMemoryRequirements2.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryRequirements2.Array getVk(){
            return (VkMemoryRequirements2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryRequirements2 get(int i){
            return new VulkanMemoryRequirements2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryRequirements2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryRequirements2.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryRequirements2.Pointer(value));
        }

        @Override
        public VkMemoryRequirements2.Pointer getVk(){
            return (VkMemoryRequirements2.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryRequirements2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryRequirements2.Pointer> {
            public Array(int count) {
                super(new VkMemoryRequirements2.Pointer.Array(count));
            }

            public Array(VulkanMemoryRequirements2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryRequirements2.Pointer.Array getVk(){
                return (VkMemoryRequirements2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryRequirements2.Pointer get(int i){
                return new VulkanMemoryRequirements2.Pointer(getVk().get(i));
            }
        }
    }
}
