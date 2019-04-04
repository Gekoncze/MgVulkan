package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkStencilOp.html">khronos documentation</a>
 **/
public class VulkanStencilOp extends VulkanEnum {
    public static final int KEEP = VkStencilOp.VK_STENCIL_OP_KEEP;
    public static final int ZERO = VkStencilOp.VK_STENCIL_OP_ZERO;
    public static final int REPLACE = VkStencilOp.VK_STENCIL_OP_REPLACE;
    public static final int INCREMENT_AND_CLAMP = VkStencilOp.VK_STENCIL_OP_INCREMENT_AND_CLAMP;
    public static final int DECREMENT_AND_CLAMP = VkStencilOp.VK_STENCIL_OP_DECREMENT_AND_CLAMP;
    public static final int INVERT = VkStencilOp.VK_STENCIL_OP_INVERT;
    public static final int INCREMENT_AND_WRAP = VkStencilOp.VK_STENCIL_OP_INCREMENT_AND_WRAP;
    public static final int DECREMENT_AND_WRAP = VkStencilOp.VK_STENCIL_OP_DECREMENT_AND_WRAP;

    public VulkanStencilOp(){
        super(new VkStencilOp());
    }

    public VulkanStencilOp(VkStencilOp vk){
        super(vk);
    }

    @Override
    public VkStencilOp getVk(){
        return (VkStencilOp) super.getVk();
    }

    public VulkanStencilOp(int value){
        super(new VkStencilOp(value));
    }

    @Override
    public String toString() {
        if(getValue() == KEEP) return "KEEP";
        if(getValue() == ZERO) return "ZERO";
        if(getValue() == REPLACE) return "REPLACE";
        if(getValue() == INCREMENT_AND_CLAMP) return "INCREMENT_AND_CLAMP";
        if(getValue() == DECREMENT_AND_CLAMP) return "DECREMENT_AND_CLAMP";
        if(getValue() == INVERT) return "INVERT";
        if(getValue() == INCREMENT_AND_WRAP) return "INCREMENT_AND_WRAP";
        if(getValue() == DECREMENT_AND_WRAP) return "DECREMENT_AND_WRAP";
        return "UNKNOWN";
    }

    public static class Array extends VulkanStencilOp implements cz.mg.collections.array.ReadonlyArray<VulkanStencilOp> {
        public Array(VkStencilOp.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkStencilOp.Array(count));
        }

        public Array(int count, VulkanStencilOp o){
            this(new VkStencilOp.Array(count, o.getVk()));
        }

        @Override
        public VkStencilOp.Array getVk(){
            return (VkStencilOp.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanStencilOp get(int i){
            return new VulkanStencilOp(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkStencilOp.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkStencilOp.Pointer());
        }

        public Pointer(long value) {
            this(new VkStencilOp.Pointer(value));
        }

        @Override
        public VkStencilOp.Pointer getVk(){
            return (VkStencilOp.Pointer) super.getVk();
        }

        public static class Array extends VulkanStencilOp.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanStencilOp.Pointer> {
            public Array(int count) {
                super(new VkStencilOp.Pointer.Array(count));
            }

            public Array(VulkanStencilOp[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkStencilOp.Pointer.Array getVk(){
                return (VkStencilOp.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanStencilOp.Pointer get(int i){
                return new VulkanStencilOp.Pointer(getVk().get(i));
            }
        }
    }
}
