package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanOffset2D extends VulkanObject {
    public VulkanOffset2D(){
        super(new VkOffset2D());
    }

    public VulkanOffset2D(VkOffset2D vk){
        super(vk);
    }

    @Override
    public VkOffset2D getVk(){
        return (VkOffset2D) super.getVk();
    }

    public VulkanOffset2D(VulkanInt32 x, VulkanInt32 y) {
        super(new VkOffset2D(x.getVk(), y.getVk()));
    }

    public VulkanInt32 getX() {
        return new VulkanInt32(getVk().getX());
    }

    public void setX(VulkanInt32 x) {
        getVk().setX(x.getVk());
    }

    public VulkanInt32 getY() {
        return new VulkanInt32(getVk().getY());
    }

    public void setY(VulkanInt32 y) {
        getVk().setY(y.getVk());
    }


    public static class Array extends VulkanOffset2D implements cz.mg.collections.array.ReadonlyArray<VulkanOffset2D> {
        public Array(VkOffset2D.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkOffset2D.Array(count));
        }

        public Array(int count, VulkanOffset2D o){
            this(new VkOffset2D.Array(count, o.getVk()));
        }

        @Override
        public VkOffset2D.Array getVk(){
            return (VkOffset2D.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanOffset2D get(int i){
            return new VulkanOffset2D(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkOffset2D.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkOffset2D.Pointer());
        }

        public Pointer(long value) {
            this(new VkOffset2D.Pointer(value));
        }

        @Override
        public VkOffset2D.Pointer getVk(){
            return (VkOffset2D.Pointer) super.getVk();
        }

        public static class Array extends VulkanOffset2D.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanOffset2D.Pointer> {
            public Array(int count) {
                super(new VkOffset2D.Pointer.Array(count));
            }

            public Array(VulkanOffset2D[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkOffset2D.Pointer.Array getVk(){
                return (VkOffset2D.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanOffset2D.Pointer get(int i){
                return new VulkanOffset2D.Pointer(getVk().get(i));
            }
        }
    }
}
