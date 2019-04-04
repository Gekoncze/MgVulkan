package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkComponentMapping.html">khronos documentation</a>
 **/
public class VulkanComponentMapping extends VulkanObject {
    public VulkanComponentMapping(){
        super(new VkComponentMapping());
    }

    public VulkanComponentMapping(VkComponentMapping vk){
        super(vk);
    }

    @Override
    public VkComponentMapping getVk(){
        return (VkComponentMapping) super.getVk();
    }

    public VulkanComponentMapping(VulkanComponentSwizzle r, VulkanComponentSwizzle g, VulkanComponentSwizzle b, VulkanComponentSwizzle a) {
        super(new VkComponentMapping(r.getVk(), g.getVk(), b.getVk(), a.getVk()));
    }

    public VulkanComponentSwizzle getR() {
        return new VulkanComponentSwizzle(getVk().getR());
    }

    public void setR(VulkanComponentSwizzle r) {
        getVk().setR(r.getVk());
    }

    public VulkanComponentSwizzle getG() {
        return new VulkanComponentSwizzle(getVk().getG());
    }

    public void setG(VulkanComponentSwizzle g) {
        getVk().setG(g.getVk());
    }

    public VulkanComponentSwizzle getB() {
        return new VulkanComponentSwizzle(getVk().getB());
    }

    public void setB(VulkanComponentSwizzle b) {
        getVk().setB(b.getVk());
    }

    public VulkanComponentSwizzle getA() {
        return new VulkanComponentSwizzle(getVk().getA());
    }

    public void setA(VulkanComponentSwizzle a) {
        getVk().setA(a.getVk());
    }


    public static class Array extends VulkanComponentMapping implements cz.mg.collections.array.ReadonlyArray<VulkanComponentMapping> {
        public Array(VkComponentMapping.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkComponentMapping.Array(count));
        }

        public Array(int count, VulkanComponentMapping o){
            this(new VkComponentMapping.Array(count, o.getVk()));
        }

        @Override
        public VkComponentMapping.Array getVk(){
            return (VkComponentMapping.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanComponentMapping get(int i){
            return new VulkanComponentMapping(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkComponentMapping.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkComponentMapping.Pointer());
        }

        public Pointer(long value) {
            this(new VkComponentMapping.Pointer(value));
        }

        @Override
        public VkComponentMapping.Pointer getVk(){
            return (VkComponentMapping.Pointer) super.getVk();
        }

        public static class Array extends VulkanComponentMapping.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanComponentMapping.Pointer> {
            public Array(int count) {
                super(new VkComponentMapping.Pointer.Array(count));
            }

            public Array(VulkanComponentMapping[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkComponentMapping.Pointer.Array getVk(){
                return (VkComponentMapping.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanComponentMapping.Pointer get(int i){
                return new VulkanComponentMapping.Pointer(getVk().get(i));
            }
        }
    }
}
