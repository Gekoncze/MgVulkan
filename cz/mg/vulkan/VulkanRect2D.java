package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanRect2D extends VulkanObject {
    public VulkanRect2D(){
        super(new VkRect2D());
    }

    public VulkanRect2D(VkRect2D vk){
        super(vk);
    }

    @Override
    public VkRect2D getVk(){
        return (VkRect2D) super.getVk();
    }

    public VulkanRect2D(VulkanOffset2D offset, VulkanExtent2D extent) {
        super(new VkRect2D(offset.getVk(), extent.getVk()));
    }

    public VulkanOffset2D getOffset() {
        return new VulkanOffset2D(getVk().getOffset());
    }

    public void setOffset(VulkanOffset2D offset) {
        getVk().setOffset(offset.getVk());
    }

    public VulkanExtent2D getExtent() {
        return new VulkanExtent2D(getVk().getExtent());
    }

    public void setExtent(VulkanExtent2D extent) {
        getVk().setExtent(extent.getVk());
    }


    public static class Array extends VulkanRect2D implements cz.mg.collections.array.ReadonlyArray<VulkanRect2D> {
        public Array(VkRect2D.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkRect2D.Array(count));
        }

        public Array(int count, VulkanRect2D o){
            this(new VkRect2D.Array(count, o.getVk()));
        }

        @Override
        public VkRect2D.Array getVk(){
            return (VkRect2D.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanRect2D get(int i){
            return new VulkanRect2D(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkRect2D.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkRect2D.Pointer());
        }

        public Pointer(long value) {
            this(new VkRect2D.Pointer(value));
        }

        @Override
        public VkRect2D.Pointer getVk(){
            return (VkRect2D.Pointer) super.getVk();
        }

        public static class Array extends VulkanRect2D.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanRect2D.Pointer> {
            public Array(int count) {
                super(new VkRect2D.Pointer.Array(count));
            }

            public Array(VulkanRect2D[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkRect2D.Pointer.Array getVk(){
                return (VkRect2D.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanRect2D.Pointer get(int i){
                return new VulkanRect2D.Pointer(getVk().get(i));
            }
        }
    }
}
