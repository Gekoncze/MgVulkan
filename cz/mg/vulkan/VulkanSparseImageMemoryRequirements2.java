package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseImageMemoryRequirements2.html">khronos documentation</a>
 **/
public class VulkanSparseImageMemoryRequirements2 extends VulkanObject {
    public VulkanSparseImageMemoryRequirements2(){
        super(new VkSparseImageMemoryRequirements2());
    }

    public VulkanSparseImageMemoryRequirements2(VkSparseImageMemoryRequirements2 vk){
        super(vk);
    }

    @Override
    public VkSparseImageMemoryRequirements2 getVk(){
        return (VkSparseImageMemoryRequirements2) super.getVk();
    }

    public VulkanSparseImageMemoryRequirements2(VulkanStructureType sType, VulkanObject pNext, VulkanSparseImageMemoryRequirements memoryRequirements) {
        super(new VkSparseImageMemoryRequirements2(sType.getVk(), pNext.getVk(), memoryRequirements.getVk()));
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

    public VulkanSparseImageMemoryRequirements getMemoryRequirements() {
        return new VulkanSparseImageMemoryRequirements(getVk().getMemoryRequirements());
    }

    public void setMemoryRequirements(VulkanSparseImageMemoryRequirements memoryRequirements) {
        getVk().setMemoryRequirements(memoryRequirements.getVk());
    }


    public static class Array extends VulkanSparseImageMemoryRequirements2 implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageMemoryRequirements2> {
        public Array(VkSparseImageMemoryRequirements2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSparseImageMemoryRequirements2.Array(count));
        }

        public Array(int count, VulkanSparseImageMemoryRequirements2 o){
            this(new VkSparseImageMemoryRequirements2.Array(count, o.getVk()));
        }

        @Override
        public VkSparseImageMemoryRequirements2.Array getVk(){
            return (VkSparseImageMemoryRequirements2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSparseImageMemoryRequirements2 get(int i){
            return new VulkanSparseImageMemoryRequirements2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSparseImageMemoryRequirements2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSparseImageMemoryRequirements2.Pointer());
        }

        public Pointer(long value) {
            this(new VkSparseImageMemoryRequirements2.Pointer(value));
        }

        @Override
        public VkSparseImageMemoryRequirements2.Pointer getVk(){
            return (VkSparseImageMemoryRequirements2.Pointer) super.getVk();
        }

        public static class Array extends VulkanSparseImageMemoryRequirements2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageMemoryRequirements2.Pointer> {
            public Array(int count) {
                super(new VkSparseImageMemoryRequirements2.Pointer.Array(count));
            }

            public Array(VulkanSparseImageMemoryRequirements2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSparseImageMemoryRequirements2.Pointer.Array getVk(){
                return (VkSparseImageMemoryRequirements2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSparseImageMemoryRequirements2.Pointer get(int i){
                return new VulkanSparseImageMemoryRequirements2.Pointer(getVk().get(i));
            }
        }
    }
}
