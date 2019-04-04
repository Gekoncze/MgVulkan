package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkOffset3D.html">khronos documentation</a>
 **/
public class VulkanOffset3D extends VulkanObject {
    public VulkanOffset3D(){
        super(new VkOffset3D());
    }

    public VulkanOffset3D(VkOffset3D vk){
        super(vk);
    }

    @Override
    public VkOffset3D getVk(){
        return (VkOffset3D) super.getVk();
    }

    public VulkanOffset3D(VulkanInt32 x, VulkanInt32 y, VulkanInt32 z) {
        super(new VkOffset3D(x.getVk(), y.getVk(), z.getVk()));
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

    public VulkanInt32 getZ() {
        return new VulkanInt32(getVk().getZ());
    }

    public void setZ(VulkanInt32 z) {
        getVk().setZ(z.getVk());
    }


    public static class Array extends VulkanOffset3D implements cz.mg.collections.array.ReadonlyArray<VulkanOffset3D> {
        public Array(VkOffset3D.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkOffset3D.Array(count));
        }

        public Array(int count, VulkanOffset3D o){
            this(new VkOffset3D.Array(count, o.getVk()));
        }

        @Override
        public VkOffset3D.Array getVk(){
            return (VkOffset3D.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanOffset3D get(int i){
            return new VulkanOffset3D(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkOffset3D.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkOffset3D.Pointer());
        }

        public Pointer(long value) {
            this(new VkOffset3D.Pointer(value));
        }

        @Override
        public VkOffset3D.Pointer getVk(){
            return (VkOffset3D.Pointer) super.getVk();
        }

        public static class Array extends VulkanOffset3D.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanOffset3D.Pointer> {
            public Array(int count) {
                super(new VkOffset3D.Pointer.Array(count));
            }

            public Array(VulkanOffset3D[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkOffset3D.Pointer.Array getVk(){
                return (VkOffset3D.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanOffset3D.Pointer get(int i){
                return new VulkanOffset3D.Pointer(getVk().get(i));
            }
        }
    }
}
